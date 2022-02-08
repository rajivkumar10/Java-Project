package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ContextApp {

    public  static void main(String[] args) {
        AgentInfo a1 = new AgentInfo("X", "T1");
        AgentInfo a2 = new AgentInfo("Y", "T2");
        Event e1 = new Event("type1", a1);
        Event e2 = new Event("type2", a2);
        List<Event> events = new ArrayList<>();
        events.add(e1);
        events.add(e2);

        getTeamRequestMap(events);
    }

    public static Map<String, List<Event>> getTeamRequestMap(List<Event> request) {

        request.stream().collect(Collectors.groupingBy(e -> e.getAgentInfo().getTeamName()));
        return null;

    }
}
