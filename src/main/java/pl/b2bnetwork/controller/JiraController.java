package pl.b2bnetwork.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.b2bnetwork.domain.TaskJira;

@RestController
public class JiraController {

    @RequestMapping("/mapping")
    public String display() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jira.atlassian.com/rest/api/2/issue/JRACLOUD-34423?expand=names,renderedFields";
        TaskJira taskJira = restTemplate.getForObject(url, TaskJira.class);
        return taskJira.toString();
    }
}
