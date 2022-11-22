package com.insuranceterm.api.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insuranceterm.api.object.Term;
import com.insuranceterm.api.object.TestOutcome;
import com.insuranceterm.api.repository.TermRepository;
import com.insuranceterm.api.repository.TestOutcomeRepository;

@RestController
public class TermController {
    
    private TermRepository termRepository;
    private TestOutcomeRepository testOutcomeRepository;

    public TermController(TermRepository termRepository, TestOutcomeRepository testOutcomeRepository) {
        this.termRepository = termRepository;
        this.testOutcomeRepository = testOutcomeRepository;
    }
    
    @PostMapping("/terms/{term_id}/testOutcome")
    TestOutcome newTestOutcome(@PathVariable int term_id, @RequestBody TestOutcome testOutcome) {
        Term term = termRepository.findById(term_id).get();
        if (term.getTestOutcomes() == null) {
            term.setTestOutcomes(new ArrayList<>());
        }
        term.getTestOutcomes().add(testOutcome);
        testOutcome.setTerm(term);
        return testOutcomeRepository.save(testOutcome);
    }
}
