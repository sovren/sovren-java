// Copyright © 2020 Sovren Group, Inc. All rights reserved.
// This file is provided for use by, or on behalf of, Sovren licensees
// within the terms of their license of Sovren products or Sovren customers
// within the Terms of Service pertaining to the Sovren SaaS products.

package com.sovren.models.api.matching.ui.request;

import com.sovren.models.api.matching.request.MatchByDocumentIdOptions;

/**
 * The request body for generating a Sovren Matching UI session
 * */
public class UIMatchByDocumentIdOptions extends GenerateUIRequest<MatchByDocumentIdOptions> {
    public UIMatchByDocumentIdOptions(MatchByDocumentIdOptions options, MatchUISettings settings) {
        super(options, settings);
    }
}
