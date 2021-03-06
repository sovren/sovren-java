// Copyright © 2020 Sovren Group, Inc. All rights reserved.
// This file is provided for use by, or on behalf of, Sovren licensees
// within the terms of their license of Sovren products or Sovren customers
// within the Terms of Service pertaining to the Sovren SaaS products.

package com.sovren.models.api.matching.response;

/**
* Information about a skill match
*/
public class FoundSkill {
    
    /** Name of the skill found.*/
    public String Skill;
    
    /** {@code true} when the skill is found in the current time-frame.*/
    public boolean IsCurrent;
}
