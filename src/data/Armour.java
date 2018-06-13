package data;

public class Armour {

    public enum Armours {
        BRONZE("Bronze", "Bronze platelegs", "Bronze platebody", "Bronze full helm", "Animated Bronze Armour"),
        IRON("Iron", "Iron platelegs", "Iron platebody", "Iron full helm", "Animated Iron Armour"),
        STEEL("Steel", "Steel platelegs", "Steel platebody", "Steel full helm", "Animated Steel Armour"),
        MITHRIL("Mithril", "Mithril platelegs", "Mithril platebody", "Mithril full helm", "Animated Mithril Armour"),
        ADAMANT("Adamant", "Adamant platelegs", "Adamant platebody", "Adamant full helm", "Animated Adamant Armour"),
        RUNE("Rune", "Rune platelegs", "Rune platebody", "Rune full helm", "Animated Rune Armour");

        private String name;
        private String legs;
        private String plate;
        private String helm;
        private String npc;

        Armours(String name, String legs, String plate, String helm, String npc) {
            this.name = name;
            this.legs = legs;
            this.plate = plate;
            this.helm = helm;
            this.npc = npc;
        }

        public String getName() {
            return this.name;
        }

        public String getLegs() {
            return this.legs;
        }

        public String getPlate() {
            return this.plate;
        }

        public String getHelm() {
            return this.helm;
        }

        public String getNpc() {
            return this.npc;
        }

        public String[] getItems () {
            return new String[]{this.getLegs(), this.getPlate(), this.getHelm()};
        }

        @Override public String toString() { return this.getName(); }
    }

}