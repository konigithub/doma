package com.example.actor.services;

import com.example.actor.entity.Actor;
import com.example.actor.repository.ActorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ActorService {
        @Autowired
        private ActorRepository actorRepository;
       public Page<Actor> getAllActor(Pageable pageable) {
           return actorRepository.findAll(pageable);
        }
}
