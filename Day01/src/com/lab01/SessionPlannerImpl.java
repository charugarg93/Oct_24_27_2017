package com.lab01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SessionPlannerImpl implements SessionPlanner {

    private Map<String,String> allTopics;
    private List<String> _60MinTopics;
    private List<String> _50MinTopics;
    private List<String> _45MinTopics;

    public void setAllTopics(Map<String, String> allTopics) {
        this.allTopics = allTopics;
        _60MinTopics = new ArrayList<>();
        _50MinTopics = new ArrayList<>();
        _45MinTopics = new ArrayList<>();
        populateTopicsLists();
    }
    private void populateTopicsLists(){
        allTopics.forEach((key,value) -> {
            String[] temp = value.split("-");
            if(temp[1].contains("45 min")){
                _45MinTopics.add(temp[0].trim());
            }
            else if(temp[1].contains("60 min")){
                _60MinTopics.add(temp[0].trim());
            }
            else if(temp[1].contains("50 min")){
                _50MinTopics.add(temp[0].trim());
            }
        });
    }

    @Override
    public int get60MinSessionCount() {
        return _60MinTopics.size();
    }

    @Override
    public int get50MinSessionCount() {
        return _50MinTopics.size();
    }

    @Override
    public int get45MinSessionCount() {
        return _45MinTopics.size();
    }
}
