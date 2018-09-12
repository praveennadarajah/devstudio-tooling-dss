/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.developerstudio.eclipse.artifact.dataserviceTemplate.wizard;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.developerstudio.eclipse.utils.template.TemplateUtil;

public class ResourceTemplateUtils extends TemplateUtil {

    private static TemplateUtil instance;

    public static TemplateUtil getInstance() {
        if (instance == null) {
            instance = new ResourceTemplateUtils();
        }
        return instance;
    }

    protected Bundle getBundle() {
        return Platform.getBundle(org.wso2.developerstudio.eclipse.artifact.dataserviceTemplate.Activator.PLUGIN_ID);
    }
}