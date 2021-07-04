package io.mani.RestFullApi.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private TopicService topicService;


    @RequestMapping("/topics")
    public List<Topic> TopicController() {
        return topicService.getAllTopics();
    }



    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }


    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopics(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopics(id,topic);
    }



    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopics(id);
    }
}
