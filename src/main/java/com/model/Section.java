package com.model;

import java.util.ArrayList;
import java.util.List;

public class Section {

    private String title;
    private String body;
    private SectionType sectionType;
    private DataType dataType;
    private List<Answer> answers;

    public Section(String title, String body, DataType dataType, SectionType sectionType)
    {
        this.title = title;
        this.body = body;
        this.dataType = dataType;
        this.sectionType = sectionType;
        this.answers = new ArrayList<>();
    }

    public String getTitle()
    {
        return title;
    }

    public String getBody()
    {
        return body;
    }

    public SectionType getSectionType()
    {
        return sectionType;
    }

    public DataType getDataType()
    {
        return dataType;
    }

    public List<Answer> getAnswers()
    {
        return answers;
    }

    public void addAnswer(Answer answer)
    {
        if (answer != null)
        {
            answers.add(answer);
        }
    }
    
}
