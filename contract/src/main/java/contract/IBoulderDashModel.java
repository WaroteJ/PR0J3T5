package contract;

public interface IBoulderDashModel {

    /**
     * Gets the road.
     *
     * @return the road
     */
    IModel getModel();

    /**
     * Gets the my vehicle.
     *
     * @return the myVehicle
     */
    IMobile getMyPlayer();

}
