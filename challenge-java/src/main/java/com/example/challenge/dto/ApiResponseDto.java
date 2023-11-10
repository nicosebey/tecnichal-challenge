package com.example.challenge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ApiResponseDto {
    @JsonProperty("Count")
    private int count;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("SearchCriteria")
    private String searchCriteria;
    @JsonProperty("Results")
    private List<MfrDto> results;

    public int getCount() {
        return count;
    }

    public List<MfrDto> getResults() {
        return results;
    }

    public String getMessage() {
        return message;
    }

    public String getSearchCriteria() {
        return searchCriteria;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setResults(List<MfrDto> results) {
        this.results = results;
    }

    public void setSearchCriteria(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

}
