package io.mani.RestFullApi.topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<TopicModel> topics = new ArrayList<>(Arrays.asList(
            new TopicModel("angular", "Angular course", "A Good Framework to handle Front end"),
            new TopicModel("react", "React  boot camp", "A Good Facebook Framework to handle Front end"),
            new TopicModel("spring", "Spring Boot", "A Good Framework to handle back end for enterprise apps"),
            new TopicModel("node", "Node Js", "The best way to handle backend fast reliable and secure "),
            new TopicModel("nest", "Nest Js", "The out of the Box handle backend solution "),
            new TopicModel("svelte", "Svelte", "The Future if front end technology ")

    ));

    public List<TopicModel> getAllTopics() {
        return topics;
    }

    public TopicModel getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopics(TopicModel topic) {
        topics.add(topic);
    }

    public void updateTopics(String id , TopicModel topic) {
        for (int i =0; i<topics.size();i++){
            TopicModel t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopics(String id) {
        topics.removeIf(t -> t.getId().equals(id));

    }
}
