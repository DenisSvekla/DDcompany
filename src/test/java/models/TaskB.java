package models;


public class TaskB {
    private String nameTask;
    private String descriptionTask;

    public static class BuilderTask {
        private TaskB newTask;

        public static class Builder {
            private TaskB newTask;

            public Builder() {
                newTask = new TaskB();
            }

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
