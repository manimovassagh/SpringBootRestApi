package io.mani.RestFullApi.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    /**
     * private List<Topic> topics = new ArrayList<>(Arrays.asList( new
     * Topic("angular", "Angular course", "A Good Framework to handle Front end"),
     * new Topic("react", "React boot camp", "A Good Facebook Framework to handle
     * Front end"), new Topic("spring", "Spring Boot", "A Good Framework to handle
     * back end for enterprise apps"), new Topic("node", "Node Js", "The best way to
     * handle backend fast reliable and secure "), new Topic("nest", "Nest Js", "The
     * out of the Box handle backend solution "), new Topic("svelte", "Svelte", "The
     * Future if front end technology ")
     * <p>
     * ));
     */

    public List<Topic> getAllTopics() {
        // return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopic(String id) {
        // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id);

    }

    public void addTopics(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopics(String id, Topic topic) {
        topicRepository.save(topic);

        // for (int i = 0; i < topics.size(); i++) {
        // Topic t = topics.get(i);
        // if (t.getId().equals(id)) {
        // topics.set(i, topic);
        // return;
        // }
        // }

    }

    public void deleteTopics(String id) {
        topicRepository.deleteById(id);
        // topics.removeIf(t -> t.getId().equals(id));

    }
}
