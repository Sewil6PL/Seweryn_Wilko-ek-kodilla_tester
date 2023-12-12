package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static double calculateAveragePostsForUsersAbove40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static double calculateAveragePostsForUsersBelow40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<User> allUsers = UsersRepository.getUsersList();

        double averagePostsAbove40 = calculateAveragePostsForUsersAbove40(allUsers);
        double averagePostsBelow40 = calculateAveragePostsForUsersBelow40(allUsers);

        System.out.println("Average posts for users above 40: " + averagePostsAbove40);
        System.out.println("Average posts for users below 40: " + averagePostsBelow40);
    }
}
