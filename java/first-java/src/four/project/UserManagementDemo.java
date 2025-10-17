package four.project;

import java.util.*;

public class UserManagementDemo {
    public static void main(String[] args) {
//        Set<String> user1Roles = new HashSet<>(Arrays.asList("ADMIN", "USER"));
//        User user1 = new User(true,"Alice", user1Roles);

        List<User> users = new ArrayList<>();
        users.add(new User(true,"Alice",
                new HashSet<>(Arrays.asList("ADMIN", "USER"))));

        users.add(new User(false,"Bob",
                new HashSet<>(Arrays.asList("USER"))));

        users.add(new User(true,"Charlie",
                new HashSet<>(Arrays.asList("USER"))));

        // REMOVE INACTIVE USERS
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().isActive())
                iterator.remove();
        }

        // PRINT ACTIVE USERS
        System.out.println("ACTIVE USERS");
        for (User user : users)
            System.out.println(user.getName());

        // COUNT USERS PER ROLE
        Map<String, Integer> roleCount = new HashMap<>();
//        roleCount.get("gsagsag", 0);
        // ADMIN: 1
        // USER: 1

        for (User user : users) {
            for (String role : user.getRoles()) {
                roleCount.put(role, roleCount.getOrDefault(role, 0) + 1);
            }
        }


        System.out.println("All Roles : Count");
        for (Map.Entry<String, Integer> entry : roleCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
