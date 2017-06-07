package com.welldatabase.api.request;

public class ExportRequest<T extends CommonFilters> {
    public T filters;

    private String exportFormat;
    public ExportRequest(T filters) {
        this.filters = filters;
    }

    public String getExportFormat() {
        return exportFormat;
    }

    public ExportRequest setExportFormat(String exportFormat) {
        this.exportFormat = exportFormat;
        return this;
    }
}
