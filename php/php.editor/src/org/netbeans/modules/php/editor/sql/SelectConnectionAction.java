/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.php.editor.sql;

import java.awt.event.ActionEvent;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import org.netbeans.editor.BaseAction;
import org.netbeans.editor.Utilities;



/**
 * Choose a connection to use for completion and potentially other
 * db-related features.
 *
 * @author David Van Couvering
 */
public class SelectConnectionAction extends BaseAction {

    private static final String ICON_PATH = "org/netbeans/modules/php/editor/resources/catalog.png"; // NOI18N
    private static final String ACTION_NAME = "select-connection"; // NOI8N

    public SelectConnectionAction() {
        super(ACTION_NAME);
        putValue(BaseAction.ICON_RESOURCE_PROPERTY, ICON_PATH);
    }

    @Override
    public void actionPerformed(ActionEvent evt, JTextComponent target) {
        if (target == null) {
            return;
        }

        Document doc = Utilities.getDocument(target);
        DatabaseConnectionSupport.selectDatabaseConnection(doc);
    }

    @Override
    protected Class getShortDescriptionBundleClass() {
        return SelectConnectionAction.class;
    }

}
