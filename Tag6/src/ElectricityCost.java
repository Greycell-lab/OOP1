public class ElectricityCost {
    int wattConsumption;
    double runtimeHour;
    double pricekWh;

    /**
     * Constructer that gets Watt, Runtime in hours and Price per kWh
     * @param wattConsumption
     * Consumption in Watt
     * @param runtimeHour
     * Runtime in Hours per Day
     * @param pricekWh
     * Price per kWh
     */
    ElectricityCost(int wattConsumption, double runtimeHour, double pricekWh)
    {
        this.wattConsumption = wattConsumption;
        this.runtimeHour = runtimeHour;
        this.pricekWh = pricekWh;
    }

    /**
     *
     * @return Double value Cost per Year
     */
    public double costs()
    {
        return (wattConsumption * runtimeHour * 365 / 1000) * pricekWh;
    }

}
