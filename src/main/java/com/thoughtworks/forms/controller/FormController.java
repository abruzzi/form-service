package com.thoughtworks.forms.controller;

import com.thoughtworks.forms.model.Form;
import com.thoughtworks.forms.repo.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/forms")
public class FormController {

    @Autowired
    private FormRepository formRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List fetchAll(
        @RequestParam(value = "page", defaultValue = "0", required = false) int page,
        @RequestParam(value = "count", defaultValue = "10", required = false) int count) {
        Page result = formRepository.findAll(new PageRequest(page, count));
        return result.getContent();
    }


    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Form find(@PathVariable String id) {
        return formRepository.findOne(id);
    }

}
