package com.welldatabase.api.request;

import java.util.Date;

public abstract class CommonFilters {
    public Range<Date> DateLastModified = new Range<Date>();
    public Range<Date> DateCreated= new Range<Date>();
}
