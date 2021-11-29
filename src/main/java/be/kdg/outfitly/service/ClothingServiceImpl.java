package be.kdg.outfitly.service;

import be.kdg.outfitly.domain.ClothingItem;
import be.kdg.outfitly.repository.ClothingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothingServiceImpl implements ClothingService {
    private final Logger logger = LoggerFactory.getLogger(ClothingServiceImpl.class);
    private final ClothingRepository clothingRepository;

    public ClothingServiceImpl(ClothingRepository clothingRepository) {
        this.clothingRepository = clothingRepository;
    }

    @Override
    public ClothingItem findById(int id) {
        return clothingRepository.findById(id);
    }

    @Override
    public ClothingItem create(ClothingItem clothingItem) {
        return clothingRepository.create(clothingItem);
    }

    @Override
    public List<ClothingItem> read() {
        return clothingRepository.read();
    }

    @Override
    public void delete(int id) {
        ClothingItem clothingItemToRemove = clothingRepository.findById(id);
        clothingRepository.delete(clothingItemToRemove);
    }
}
