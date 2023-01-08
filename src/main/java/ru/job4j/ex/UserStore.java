package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User a : users) {
            if (a.getUsername().equals(login)) {
                return a;
            }
        }
        throw new UserNotFoundException("User not found.");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() || user.getUsername().length() > 3) {
            return true;
        }
        throw new UserInvalidException("User is not valid.");
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petra Arsentev", true)
            };
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ei) {
            ei.printStackTrace();
        } catch (UserNotFoundException en) {
            en.printStackTrace();
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}