/*
 * Copyright (c) 2018-2020 VMware, Inc. All Rights Reserved.
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with separate copyright notices
 * and license terms. Your use of these subcomponents is subject to the terms and
 * conditions of the subcomponent's license, as noted in the LICENSE file.
 */

package com.vmware.admiral.test.ui.pages.identity;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import com.vmware.admiral.test.ui.pages.common.PageValidator;

public class UsersAndGroupsTabValidator extends PageValidator<UsersAndGroupsTabLocators> {

    public UsersAndGroupsTabValidator(By[] iFrameLocators, UsersAndGroupsTabLocators pageLocators) {
        super(iFrameLocators, pageLocators);
    }

    @Override
    public void validateIsCurrentPage() {
        element(locators().headerText()).shouldHave(Condition.text(
                "Import users and groups into the system. Then assign project roles to a user or group. You can also make a user a global cloud admin."));
    }
}
