/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aut.utcluj.isp.ex3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mihai.hulea
 */
public class FlightController {
    private List<Drone> drones = new ArrayList<>();

    /**
     * Add new drone
     *
     * @param d - drone to be added
     */
    public void addDrone(Drone d) {
        drones.add(d);

    }

    /**
     * Find drone by id
     *
     * @param id - unique drone id
     * @return {@link Drone} instance or null if not found
     */
    public Drone findById(String id) {
        for (Drone drone : drones) {
            if (drone.getId().equals(id)) {
                return drone;
            } else {
                return null;
            }

        }
        return null;
    }

    /**
     * Get all drones with a specific state
     *
     * @param state - desired state (true / false)
     * @return list of drones with specific state. If not drones are found, an empty list will be returned
     */
    public List<Drone> getAllByState(boolean state) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Remove drone by a specific id
     *
     * @param id - unique drone id
     */
    public void remove(String id) {
        for (Drone drone : drones) {
            if (drone.getId().equals(id)) {
                drones.remove(Integer.parseInt(id));
            }

        }


    }

    /**
     * Return number of entities.
     *
     * @return
     */
    public int count() {
        return drones.size();

    }
}
