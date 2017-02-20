package com.webianks.exp.scout.model;

import java.util.List;

/**
 * Created by R Ankit on 20-02-2017.
 */

public class NamedEntities {


    /**
     * status : OK
     * usage : By accessing AlchemyAPI or using information generated by AlchemyAPI, you are agreeing to be bound by the AlchemyAPI Terms of Use: http://www.alchemyapi.com/company/terms.html
     * url :
     * language : english
     * entities : [{"count":"1","text":"Ravi","type":"USERNAME"}]
     * model : cc627acd-2976-4915-b16d-b33674d1f858
     */

    private String status;
    private String usage;
    private String url;
    private String language;
    private String model;
    private List<EntitiesBean> entities;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<EntitiesBean> getEntities() {
        return entities;
    }

    public void setEntities(List<EntitiesBean> entities) {
        this.entities = entities;
    }

    public static class EntitiesBean {
        /**
         * count : 1
         * text : Ravi
         * type : USERNAME
         */

        private String count;
        private String text;
        private String type;

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}