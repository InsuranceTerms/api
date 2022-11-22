package com.insuranceterm.api.object;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "test_outcome")
@Getter
@Setter
public class TestOutcome {
    
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "success", nullable = false)
    private boolean success;

    @Column(name = "attempt_date", nullable = false)
    private Date attemptDate;
    
    @ManyToOne
    @JoinColumn(name = "term_id", nullable = false)
    @JsonIgnore
    private Term term;
}
