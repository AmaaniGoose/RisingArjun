package com.risingarjun.arjun.service;

import com.risingarjun.arjun.service.dto.FeatureDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.risingarjun.arjun.domain.Feature}.
 */
public interface FeatureService {

    /**
     * Save a feature.
     *
     * @param featureDTO the entity to save.
     * @return the persisted entity.
     */
    FeatureDTO save(FeatureDTO featureDTO);

    /**
     * Get all the features.
     *
     * @return the list of entities.
     */
    List<FeatureDTO> findAll();


    /**
     * Get the "id" feature.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<FeatureDTO> findOne(Long id);

    /**
     * Delete the "id" feature.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
