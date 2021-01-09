package com.uwaai.datareststastemachine.order.core;

import com.uwaai.datareststastemachine.order.OrderEvent;
import com.uwaai.datareststastemachine.order.OrderState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
//import org.springframework.statemachine.data.StateRepository;
//import org.springframework.statemachine.data.TransitionRepository;
//import org.springframework.statemachine.data.jpa.JpaRepositoryState;
//import org.springframework.statemachine.data.jpa.JpaRepositoryTransition;

@Configuration
public class MachineConfig {

//    @Autowired
//    StateRepository<JpaRepositoryState> stateRepository;
//
//    @Autowired
//    TransitionRepository<JpaRepositoryTransition> transitionRepository;
//
//    void addConfig() {
//        JpaRepositoryState stateSubmitted = new JpaRepositoryState(OrderState.SUBMITTED.toString(), true);
//        JpaRepositoryState statePaid = new JpaRepositoryState(OrderState.PAID.toString());
//        JpaRepositoryState stateShipped = new JpaRepositoryState(OrderState.SHIPPED.toString());
//
//        stateRepository.save(stateSubmitted);
//        stateRepository.save(statePaid);
//        stateRepository.save(stateShipped);
//
//        JpaRepositoryTransition transitionSubmittedToPaid = new JpaRepositoryTransition(stateSubmitted, statePaid, OrderEvent.Pay.toString());
//        JpaRepositoryTransition transitionPaidToShipped = new JpaRepositoryTransition(statePaid, stateShipped, OrderEvent.Ship.toString());
//
//        transitionRepository.save(transitionSubmittedToPaid);
//        transitionRepository.save(transitionPaidToShipped);
//    }

}
