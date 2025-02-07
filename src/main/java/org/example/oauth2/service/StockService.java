package org.example.oauth2.service;

import lombok.RequiredArgsConstructor;
import org.example.oauth2.entity.StockEntity;
import org.example.oauth2.repository.StockRepository;
import org.springframework.stereotype.Service;

@Service
//@Transactional
@RequiredArgsConstructor
public class StockService {
    private final StockRepository stockRepository;

    // 한개의 스레드만 접근 가능
    public synchronized void decrease(Long id, Long quantity) {
        // stock 조회
        // 재고를 감소시킨 후 갱신된 값을 저장
        StockEntity stockEntity = stockRepository.findById(id).orElseThrow();
        stockEntity.decrementQuantity(quantity);
        stockRepository.save(stockEntity);
    }
}
