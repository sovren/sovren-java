// Copyright © 2020 Sovren Group, Inc. All rights reserved.
// This file is provided for use by, or on behalf of, Sovren licensees
// within the terms of their license of Sovren products or Sovren customers
// within the Terms of Service pertaining to the Sovren SaaS products.

package com.sovren.models.api.geocoding;

import com.sovren.models.api.ApiResponse;
import com.sovren.models.job.ParsedJob;

/** The {@link ApiResponse#Value} from a 'geocode job' response */
public class GeocodeJobResponseValue {
    
    /** The job you sent to be geocoded with geolocation coordinates added */
    public ParsedJob JobData;
}
