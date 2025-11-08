package com.bite.spring.demo.service;

import com.bite.spring.demo.mapper.MessageMapper;
import com.bite.spring.demo.model.MessageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageMapper messageMapper;
    public void addMessage(MessageInfo messageInfo) {
        messageMapper.insertMessage(messageInfo);
    }

    public List<MessageInfo> queryAll() {
        return messageMapper.queryAll();
    }
}
