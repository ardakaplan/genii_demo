package com.ardakaplan.geniidemo.aobobjects;

/**
 * Created by Arda Kaplan at 27-Nov-19
 * <p>
 * arda.kaplan09@gmail.com
 */
public enum Company {

    NO_COMPANY("0", "NO_COMPANY"),
    AYEDAS("6800", "AYEDAS"),
    BASKENT("1000", "BASKENT"),
    TOROSLAR("7500", "TOROSLAR");

    private final String cod;
    private final String serviceName;


    Company(String cod, String serviceName) {
        this.cod = cod;
        this.serviceName = serviceName;
    }

    public String getCod() {
        return cod;
    }

    public String getServiceName() {
        return serviceName;
    }

    public static Company getCompanyByCode(String code) {

        for (Company company : Company.values()) {

            if (company.getCod().equals(code)) {

                return company;
            }
        }

        return NO_COMPANY;
    }
}
