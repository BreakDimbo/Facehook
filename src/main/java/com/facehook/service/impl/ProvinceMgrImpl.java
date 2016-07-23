package com.facehook.service.impl;

import com.facehook.service.ProvinceMgr;
import com.facehook.service.base.MgrBaseImpl;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
@Component
public class ProvinceMgrImpl extends MgrBaseImpl implements ProvinceMgr {
    public List<Object> getAllProvince() {
        return this.getResults("from ProvinceEntity p where p.countryId = 1", null);
    }
}
