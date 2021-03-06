/**
 * Copyright 2016 Mawoo Nederland
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.mawoo.wcmmanager.controller;

import nl.mawoo.wcmmanager.storage.FolderDao;
import nl.mawoo.wcmmanager.storage.ProjectDao;
import nl.mawoo.wcmmanager.storage.ScriptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
public class ScriptController {
    @Autowired
    FolderDao folderDao;
    @Autowired
    ProjectDao projectDao;
    @Autowired
    ScriptDao scriptDao;

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("projects", projectDao.findAll());
        model.addAttribute("folders", folderDao.findAll());
        model.addAttribute("scripts", scriptDao.findAll());
        return "ScriptManager";
    }
}
