package models;


public class Task {
    private String nameTask;
    private String descriptionTask;

    public static class BuilderTask {
        private Task newTask;

        public static class Builder {
            private Task newTask;

            public Builder() {newTask = new Task();}

            public Builder withNameTask(String nameTask) {
                newTask.nameTask = nameTask;
                return this;
            }

            public Builder withDescriptionTask(String descriptionTask) {
                newTask.descriptionTask = descriptionTask;
                return this;
            }
        }
    }

}
