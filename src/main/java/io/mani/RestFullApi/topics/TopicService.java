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


    public List<Topic> getAllTopics() {
        // return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopic(String id) {
             return topicRepository.findById(id);

    }

    public void addTopics(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopics(String id, Topic topic) {
        topicRepository.save(topic);


    }

    public void deleteTopics(String id) {
        topicRepository.deleteById(id);

    }
}
