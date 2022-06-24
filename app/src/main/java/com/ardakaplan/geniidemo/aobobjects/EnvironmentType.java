package com.ardakaplan.geniidemo.aobobjects;

/**
 * Created by Arda Kaplan at 12-Feb-20
 * <p>
 * arda.kaplan09@gmail.com
 */
public enum EnvironmentType {

    DIP("DIP - CANLI", "https://retail.enerjisa.com.tr/rdp/EBS_SAP_ISU_HANDHELD_Gateway_endpoint"),
    DID("DID - DEVELOPMENT", "http://10.34.65.187:80/EBS_SAP_ISU_HANDHELD_Gateway"),
    DIR("DIR - PRE PROD", "http://retailtest.enerjisa.com.tr/rdr/EBS_SAP_ISU_HANDHELD_Gateway_endpoint"),
    DIQ("DIQ - QA", "https://retailtest.enerjisa.com.tr/rdq/EBS_SAP_ISU_HANDHELD_Gateway_endpoint");

    private final String screenName;
    private final String link;

    EnvironmentType(String screenName, String link) {
        this.screenName = screenName;
        this.link = link;
    }

    public static EnvironmentType getByLink(String link) {

        for (EnvironmentType value : EnvironmentType.values()) {

            if (value.getLink().equals(link)) {

                return value;
            }
        }

        return null;
    }

    public String getLink() {
        return link;
    }
}
