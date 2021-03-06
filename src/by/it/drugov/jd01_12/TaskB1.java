package by.it.drugov.jd01_12;

import java.util.*;

public class TaskB1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            String element = scanner.next();
            if (element.equals("end")) {
                break;
            }
            if(element.equals("isn't")){
                list.add("don't");
            }
            list.add(element);
        }
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).contains(",")) {
                String s = list.get(i);
                String replace = s.replace(",", "");
                list.remove(i);
                list.add(i,replace);
            }
            if(list.get(i).contains(".")) {
                String s = list.get(i);
                String replace = s.replace(".", "");
                list.remove(i);
                list.add(i,replace);
            }
            if(list.get(i).contains(";")) {
                String s = list.get(i);
                String replace = s.replace(";", "");
                list.remove(i);
                list.add(i,replace);
            }
            map.put(list.get(i),0);
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            for (int i = 0; i < list.size(); i++) {
                if(entry.getKey().equals(list.get(i))) {
                    int value = entry.getValue();
                    value++;
                    map.put(entry.getKey(), value);
                }
            }

        }
        System.out.println(map);
    }
}
/*Nadine Gordimer


Nadine Gordimer

Once upon a Time

Someone has written to ask me to contribute to an anthology of stories for children. I
reply that I don't write children's stories; and he writes back that at a recent congress/book
fair/seminar a certain novelist said every writer ought to write at least one story for
children. I think of sending a postcard saying I don't accept that I "ought" to write anything.

And then last night I woke up — or rather was awakened without knowing what had
roused me.

A voice in the echo-chamber of the subconscious?

A sound.

A creaking of the kind made by the weight carried by one foot after another along a
wooden floor. I listened. I felt the apertures of my ears distend with concentration. Again:
the creaking. I was waiting for it; waiting to hear if it indicated that feet were moving from
room to room, coming up the passage — to my door. I have no burglar bars, no gun under the
pillow, but I have the same fears as people who do take thse precautions, and my
windowpanes are thin as rime, could shatter like a wineglass. A woman was murdered (how
do they put it) in broad daylight in a house two blocks away, last year, and the fierce dogs
who guarded an old widower and his collection of antique clocks were strangled before he
was knifed by a casual laborer he had dismissed without pay.

I was staring at the door, making it out in my mind rather than seeing it, in the dark. I lay quite
still — a victim already — the arrhythmia of my heart was fleeing, knocking this way and that
against its body-cage. How finely tuned the senses are, just out of rest, sleep! I could never listen
intently as that in the distractions of the day, I was reading every faintest sound, identifying and
classifying its possible threat.

But I learned that I was to be neither threatened nor spared. There was no human weight
pressing on the boards, the creaking was a buckling, an epicenter of stress. I was in it. The house
that surrounds me while I sleep is built on undermined ground; far beneath my bed, the floor, the
house's foundations, the stopes and passages of gold mines have hollowed the rock, and when some
face trembles, detaches and falls, three thousand feet below, the whole house shifts slightly,
bringing uneasy strain to the balance and counterbalance of brick, cement, wood and glass that hold it
as a structure around me. The misbeats of my heart tailed off like the last muffled flourishes on one
of the wooden xylophones made by the Chopi and T songa 1 migrant miners who might have been
down there, under me in the earth at that moment. The stope where the fall was could have been
disused, dripping water from its ruptured veins; or men might now be interred there in the most
profound of tombs.

I couldn't find a position in which my mind would let go of my body — release me to sleep
again. So I began to tell myself a story, a bedtime story.

In a house, in a suburb, in a city, there were a man and his wife who loved each other very much
and were living happily ever after. They had a little boy, and they loved him very much. They had
a cat and a dog that the little boy loved very much. They had a car and a caravan trailer for
holidays, and a swimming-pool which was fenced so that the little boy and his playmates would
not fall in and drown. They had a housemaid who was absolutely trustworthy and an itinerant
gardener who was highly recommended by the neighbors. For when they began to live happily ever
after they were warned, by that wise old witch, the husband's mother, not to take on anyone off the
street. They were inscribed in a medical benefit society, their pet dog was licensed, they were
insured against fire, flood damage and theft, and subscribed to the local Neighborhood Watch,
which supplied them with a plaque for their gates lettered Y OU HAVE BEEN WARNED
over the silhouette of a would-be intruder. He was masked; it could not be said if he was
black or white, and therefore proved the property owner was no racist.

It was not possible to insure the house, the swimming pool or the car against riot
damage. There were riots, but these were outside the city, where people of another color
were quartered. These people were not allowed into the suburb except as reliable
end */
