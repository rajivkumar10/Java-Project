package com.test;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ContextAppTest {

    List<Event> events;

    @Before
    public void init() {
        AgentInfo a1 = new AgentInfo("X", "T1");
        AgentInfo a2 = new AgentInfo("Y", "T2");
        Event e1 = new Event("type1", a1);
        Event e2 = new Event("type2", a2);
        events = new ArrayList<>();
        events.add(e1);
        events.add(e2);

    }

    @Test
    public void getTeamRequestMap() {
        Map<String, List<Event>> map = ContextApp.getTeamRequestMap(events);
        assertEquals(2, map.size());


    }
}