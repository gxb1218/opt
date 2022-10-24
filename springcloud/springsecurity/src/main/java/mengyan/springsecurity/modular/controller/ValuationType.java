package mengyan.springsecurity.modular.controller;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


public enum ValuationType {

    EOD("Official_EOD", "Official", "Final"), // 市价日终估值
    EOD_MAKEUP("Official_Makeup", "Official", "Revaluation"), // 市价定点估值,
    ON_DEMAND_EOD("OnDemand_EOD", "OnDemand", "Final"), // 自定义日终估值,
    ON_DEMAND_MAKEUP("OnDemand_Makeup", "OnDemand", "Revaluation"); // 自定义定点估值
    private final String value;
    private final String reportPrefix;
    private final String reportSuffix;

    ValuationType(String value, String reportPrefix, String reportSuffix) {
        this.value = value;
        this.reportPrefix = reportPrefix;
        this.reportSuffix = reportSuffix;
    }
    public String getValue() {
        return value;
    }
    public String getReportPrefix() {
        return reportPrefix;
    }
    public String getReportSuffix() {
        return reportSuffix;
    }

    public static void main(String[] args) {
        List<ValuationType> valuationTypes = new ArrayList<>();
        valuationTypes.add(EOD);
        System.err.println("valuationTypes="+valuationTypes);
    }
}
