package ru.netology.javaqa.services;

public class PosterManager {
    private String[] arrayPosters;
    private int limitPosters;

    public PosterManager(int limitPosters) {
        this.limitPosters = limitPosters;
        this.arrayPosters = new String[0];
    }

    public PosterManager() {
        this.limitPosters = 5;
        this.arrayPosters = new String[0];
    }

    public void addPoster(String newPoster) {
        String[] tmp = new String[arrayPosters.length + 1];
        for (int i = 0; i < arrayPosters.length; i++) {
            tmp[i] = arrayPosters[i];
        }
        tmp[tmp.length - 1] = newPoster;
        arrayPosters = tmp;

    }

    public int getPostersCount() {
        return this.arrayPosters.length;
    }

    public String[] findAll() {
        return this.arrayPosters;
    }

    public String[] findLast() {
        int resultLength = limitPosters;
        if (limitPosters > arrayPosters.length) {
            resultLength = arrayPosters.length;
        }

        String[] tmp = new String[resultLength];

        int j = 0;
        for (int i = arrayPosters.length - 1; i >= 0; i--) {
            tmp[j] = arrayPosters[i];
            if (j == resultLength - 1) {
                break;
            }
            j++;
        }

        return tmp;
    }
}
