package com.urise.webapp.model;

public enum ContactType {
    PHONE("Telephone"),
    MOBILE("Mibile Phone"),
    HOME_PGONE("Home phone"),
    SKYPE("Skype"),
    MAIL("Email"),
    LINKEDIN("Profile LinkedIn"),
    GITHUB("Profile GitHub"),
    STACKOVERFLOW("Profile Stackoverflow"),
    HOME_PAGE("Home Page");


    private String title;

    ContactType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
