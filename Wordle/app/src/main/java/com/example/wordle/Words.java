package com.example.wordle;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

class Words
{
    ArrayList words;
    String chosenWord;
    int size;
    public Words()
    {
        words = new ArrayList();
        words.add("which");
        words.add("there");
        words.add("their");
        words.add("about");
        words.add("would");
        words.add("these");
        words.add("other");
        words.add("words");
        words.add("could");
        words.add("write");
        words.add("water");
        words.add("first");
        words.add("after");
        words.add("where");
        words.add("right");
        words.add("think");
        words.add("three");
        words.add("years");
        words.add("place");
        words.add("sound");
        words.add("great");
        words.add("again");
        words.add("still");
        words.add("every");
        words.add("small");
        words.add("found");
        words.add("those");
        words.add("never");
        words.add("under");
        words.add("might");
        words.add("while");
        words.add("house");
        words.add("world");
        words.add("below");
        words.add("asked");
        words.add("going");
        words.add("large");
        words.add("until");
        words.add("along");
        words.add("shall");
        words.add("being");
        words.add("often");
        words.add("earth");
        words.add("began");
        words.add("since");
        words.add("study");
        words.add("night");
        words.add("light");
        words.add("above");
        words.add("paper");
        words.add("parts");
        words.add("young");
        words.add("story");
        words.add("point");
        words.add("times");
        words.add("heard");
        words.add("whole");
        words.add("white");
        words.add("given");
        words.add("means");
        words.add("music");
        words.add("miles");
        words.add("thing");
        words.add("today");
        words.add("later");
        words.add("using");
        words.add("money");
        words.add("lines");
        words.add("order");
        words.add("group");
        words.add("among");
        words.add("learn");
        words.add("known");
        words.add("space");
        words.add("table");
        words.add("early");
        words.add("trees");
        words.add("short");
        words.add("hands");
        words.add("state");
        words.add("black");
        words.add("shown");
        words.add("stood");
        words.add("front");
        words.add("voice");
        words.add("kinds");
        words.add("makes");
        words.add("comes");
        words.add("close");
        words.add("power");
        words.add("lived");
        words.add("vowel");
        words.add("taken");
        words.add("built");
        words.add("heart");
        words.add("ready");
        words.add("quite");
        words.add("class");
        words.add("bring");
        words.add("round");
        words.add("horse");
        words.add("shows");
        words.add("piece");
        words.add("green");
        words.add("stand");
        words.add("birds");
        words.add("start");
        words.add("river");
        words.add("tried");
        words.add("least");
        words.add("field");
        words.add("whose");
        words.add("girls");
        words.add("leave");
        words.add("added");
        words.add("color");
        words.add("third");
        words.add("hours");
        words.add("moved");
        words.add("plant");
        words.add("doing");
        words.add("names");
        words.add("forms");
        words.add("heavy");
        words.add("ideas");
        words.add("cried");
        words.add("check");
        words.add("floor");
        words.add("begin");
        words.add("woman");
        words.add("alone");
        words.add("plane");
        words.add("spell");
        words.add("watch");
        words.add("carry");
        words.add("wrote");
        words.add("clear");
        words.add("named");
        words.add("books");
        words.add("child");
        words.add("glass");
        words.add("human");
        words.add("takes");
        words.add("party");
        words.add("build");
        words.add("seems");
        words.add("blood");
        words.add("sides");
        words.add("seven");
        words.add("mouth");
        words.add("solve");
        words.add("north");
        words.add("value");
        words.add("death");
        words.add("maybe");
        words.add("happy");
        words.add("tells");
        words.add("gives");
        words.add("looks");
        words.add("shape");
        words.add("lives");
        words.add("steps");
        words.add("areas");
        words.add("sense");
        words.add("speak");
        words.add("force");
        words.add("ocean");
        words.add("speed");
        words.add("women");
        words.add("metal");
        words.add("south");
        words.add("grass");
        words.add("scale");
        words.add("cells");
        words.add("lower");
        words.add("sleep");
        words.add("wrong");
        words.add("pages");
        words.add("ships");
        words.add("needs");
        words.add("rocks");
        words.add("eight");
        words.add("major");
        words.add("level");
        words.add("total");
        words.add("ahead");
        words.add("reach");
        words.add("stars");
        words.add("store");
        words.add("sight");
        words.add("terms");
        words.add("catch");
        words.add("works");
        words.add("board");
        words.add("cover");
        words.add("songs");
        words.add("equal");
        words.add("stone");
        words.add("guess");
        words.add("dance");
        words.add("spoke");
        words.add("break");
        words.add("cause");
        words.add("radio");
        words.add("weeks");
        words.add("lands");
        words.add("basic");
        words.add("liked");
        words.add("trade");
        words.add("fresh");
        words.add("final");
        words.add("fight");
        words.add("meant");
        words.add("drive");
        words.add("spent");
        words.add("local");
        words.add("waxes");
        words.add("knows");
        words.add("train");
        words.add("bread");
        words.add("homes");
        words.add("teeth");
        words.add("coast");
        words.add("thick");
        words.add("brown");
        words.add("clean");
        words.add("quiet");
        words.add("sugar");
        words.add("facts");
        words.add("steel");
        words.add("forth");
        words.add("rules");
        words.add("notes");
        words.add("units");
        words.add("peace");
        words.add("month");
        words.add("verbs");
        words.add("seeds");
        words.add("helps");
        words.add("sharp");
        words.add("visit");
        words.add("woods");
        words.add("chief");
        words.add("walls");
        words.add("cross");
        words.add("wings");
        words.add("grown");
        words.add("cases");
        words.add("foods");
        words.add("crops");
        words.add("fruit");
        words.add("stick");
        words.add("wants");
        words.add("stage");
        words.add("sheep");
        words.add("nouns");
        words.add("plain");
        words.add("drink");
        words.add("bones");
        words.add("apart");
        words.add("turns");
        words.add("moves");
        words.add("touch");
        words.add("angle");
        words.add("based");
        words.add("range");
        words.add("marks");
        words.add("tired");
        words.add("older");
        words.add("farms");
        words.add("spend");
        words.add("shoes");
        words.add("goods");
        words.add("chair");
        words.add("twice");
        words.add("cents");
        words.add("empty");
        words.add("alike");
        words.add("style");
        words.add("broke");
        words.add("pairs");
        words.add("count");
        words.add("enjoy");
        words.add("score");
        words.add("shore");
        words.add("roots");
        words.add("paint");
        words.add("heads");
        words.add("shook");
        words.add("serve");
        words.add("angry");
        words.add("crowd");
        words.add("wheel");
        words.add("quick");
        words.add("dress");
        words.add("share");
        words.add("alive");
        words.add("noise");
        words.add("solid");
        words.add("cloth");
        words.add("signs");
        words.add("hills");
        words.add("types");
        words.add("drawn");
        words.add("worth");
        words.add("truck");
        words.add("piano");
        words.add("upper");
        words.add("loved");
        words.add("usual");
        words.add("faces");
        words.add("drove");
        words.add("cabin");
        words.add("boats");
        words.add("towns");
        words.add("proud");
        words.add("court");
        words.add("model");
        words.add("prime");
        words.add("fifty");
        words.add("plans");
        words.add("yards");
        words.add("prove");
        words.add("tools");
        words.add("price");
        words.add("sheet");
        words.add("smell");
        words.add("boxes");
        words.add("raise");
        words.add("match");
        words.add("truth");
        words.add("roads");
        words.add("threw");
        words.add("enemy");
        words.add("lunch");
        words.add("chart");
        words.add("scene");
        words.add("graph");
        words.add("doubt");
        words.add("guide");
        words.add("winds");
        words.add("block");
        words.add("grain");
        words.add("smoke");
        words.add("mixed");
        words.add("games");
        words.add("wagon");
        words.add("sweet");
        words.add("topic");
        words.add("extra");
        words.add("plate");
        words.add("title");
        words.add("knife");
        words.add("fence");
        words.add("falls");
        words.add("cloud");
        words.add("wheat");
        words.add("plays");
        words.add("enter");
        words.add("broad");
        words.add("steam");
        words.add("atoms");
        words.add("press");
        words.add("lying");
        words.add("basis");
        words.add("clock");
        words.add("taste");
        words.add("grows");
        words.add("thank");
        words.add("storm");
        words.add("agree");
        words.add("brain");
        words.add("track");
        words.add("smile");
        words.add("funny");
        words.add("beach");
        words.add("stock");
        words.add("hurry");
        words.add("saved");
        words.add("sorry");
        words.add("giant");
        words.add("trail");
        words.add("offer");
        words.add("ought");
        words.add("rough");
        words.add("daily");
        words.add("avoid");
        words.add("keeps");
        words.add("throw");
        words.add("allow");
        words.add("cream");
        words.add("laugh");
        words.add("edges");
        words.add("teach");
        words.add("frame");
        words.add("bells");
        words.add("dream");
        words.add("magic");
        words.add("occur");
        words.add("ended");
        words.add("chord");
        words.add("false");
        words.add("skill");
        words.add("holes");
        words.add("dozen");
        words.add("brave");
        words.add("apple");
        words.add("climb");
        words.add("outer");
        words.add("ruler");
        words.add("pitch");
        words.add("globe");
        words.add("holds");
        words.add("fixed");
        words.add("costs");
        words.add("calls");
        words.add("blank");
        words.add("staff");
        words.add("labor");
        words.add("eaten");
        words.add("youth");
        words.add("tones");
        words.add("honor");
        words.add("gases");
        words.add("doors");
        words.add("poles");
        words.add("loose");
        words.add("apply");
        words.add("tears");
        words.add("exact");
        words.add("brush");
        words.add("chest");
        words.add("layer");
        words.add("whale");
        words.add("minor");
        words.add("faith");
        words.add("tests");
        words.add("judge");
        words.add("items");
        words.add("worry");
        words.add("waste");
        words.add("hoped");
        words.add("strip");
        words.add("begun");
        words.add("aside");
        words.add("lakes");
        words.add("bound");
        words.add("depth");
        words.add("candy");
        words.add("event");
        words.add("worse");
        words.add("aware");
        words.add("shell");
        words.add("rooms");
        words.add("ranch");
        words.add("image");
        words.add("snake");
        words.add("aloud");
        words.add("dried");
        words.add("likes");
        words.add("motor");
        words.add("pound");
        words.add("knees");
        words.add("refer");
        words.add("fully");
        words.add("chain");
        words.add("shirt");
        words.add("flour");
        words.add("drops");
        words.add("spite");
        words.add("orbit");
        words.add("banks");
        words.add("shoot");
        words.add("curve");
        words.add("tribe");
        words.add("tight");
        words.add("blind");
        words.add("slept");
        words.add("shade");
        words.add("claim");
        words.add("flies");
        words.add("theme");
        words.add("queen");
        words.add("fifth");
        words.add("union");
        words.add("hence");
        words.add("straw");
        words.add("entry");
        words.add("issue");
        words.add("birth");
        words.add("feels");
        words.add("anger");
        words.add("brief");
        words.add("rhyme");
        words.add("glory");
        words.add("guard");
        words.add("flows");
        words.add("flesh");
        words.add("owned");
        words.add("trick");
        words.add("yours");
        words.add("sizes");
        words.add("noted");
        words.add("width");
        words.add("burst");
        words.add("route");
        words.add("lungs");
        words.add("uncle");
        words.add("bears");
        words.add("royal");
        words.add("kings");
        words.add("forty");
        words.add("trial");
        words.add("cards");
        words.add("brass");
        words.add("opera");
        words.add("chose");
        words.add("owner");
        words.add("vapor");
        words.add("beats");
        words.add("mouse");
        words.add("tough");
        words.add("wires");
        words.add("meter");
        words.add("tower");
        words.add("finds");
        words.add("inner");
        words.add("stuck");
        words.add("arrow");
        words.add("poems");
        words.add("label");
        words.add("swing");
        words.add("solar");
        words.add("truly");
        words.add("tense");
        words.add("beans");
        words.add("split");
        words.add("rises");
        words.add("weigh");
        words.add("hotel");
        words.add("stems");
        words.add("pride");
        words.add("swung");
        words.add("grade");
        words.add("digit");
        words.add("badly");
        words.add("boots");
        words.add("pilot");
        words.add("sales");
        words.add("swept");
        words.add("lucky");
        words.add("prize");
        words.add("stove");
        words.add("tubes");
        words.add("acres");
        words.add("wound");
        words.add("steep");
        words.add("slide");
        words.add("trunk");
        words.add("error");
        words.add("porch");
        words.add("slave");
        words.add("exist");
        words.add("faced");
        words.add("mines");
        words.add("marry");
        words.add("juice");
        words.add("raced");
        words.add("waved");
        words.add("goose");
        words.add("trust");
        words.add("fewer");
        words.add("favor");
        words.add("mills");
        words.add("views");
        words.add("joint");
        words.add("eager");
        words.add("spots");
        words.add("blend");
        words.add("rings");
        words.add("adult");
        words.add("index");
        words.add("nails");
        words.add("horns");
        words.add("balls");
        words.add("flame");
        words.add("rates");
        words.add("drill");
        words.add("trace");
        words.add("skins");
        words.add("waxed");
        words.add("seats");
        words.add("stuff");
        words.add("ratio");
        words.add("minds");
        words.add("dirty");
        words.add("silly");
        words.add("coins");
        words.add("hello");
        words.add("trips");
        words.add("leads");
        words.add("rifle");
        words.add("hopes");
        words.add("bases");
        words.add("shine");
        words.add("bench");
        words.add("moral");
        words.add("fires");
        words.add("meals");
        words.add("shake");
        words.add("shops");
        words.add("cycle");
        words.add("movie");
        words.add("slope");
        words.add("canoe");
        words.add("teams");
        words.add("folks");
        words.add("fired");
        words.add("bands");
        words.add("thumb");
        words.add("shout");
        words.add("canal");
        words.add("habit");
        words.add("reply");
        words.add("ruled");
        words.add("fever");
        words.add("crust");
        words.add("shelf");
        words.add("walks");
        words.add("midst");
        words.add("crack");
        words.add("print");
        words.add("tales");
        words.add("coach");
        words.add("stiff");
        words.add("flood");
        words.add("verse");
        words.add("awake");
        words.add("rocky");
        words.add("march");
        words.add("fault");
        words.add("swift");
        words.add("faint");
        words.add("civil");
        words.add("ghost");
        words.add("feast");
        words.add("blade");
        words.add("limit");
        words.add("germs");
        words.add("reads");
        words.add("ducks");
        words.add("dairy");
        words.add("worst");
        words.add("gifts");
        words.add("lists");
        words.add("stops");
        words.add("rapid");
        words.add("brick");
        words.add("claws");
        words.add("beads");
        words.add("beast");
        words.add("skirt");
        words.add("cakes");
        words.add("lions");
        words.add("frogs");
        words.add("tries");
        words.add("nerve");
        words.add("grand");
        words.add("armed");
        words.add("treat");
        words.add("honey");
        words.add("moist");
        words.add("legal");
        words.add("penny");
        words.add("crown");
        words.add("shock");
        words.add("taxes");
        words.add("sixty");
        words.add("altar");
        words.add("pulls");
        words.add("sport");
        words.add("drums");
        words.add("talks");
        words.add("dying");
        words.add("dates");
        words.add("drank");
        words.add("blows");
        words.add("lever");
        words.add("wages");
        words.add("proof");
        words.add("drugs");
        words.add("tanks");
        words.add("sings");
        words.add("tails");
        words.add("pause");
        words.add("herds");
        words.add("arose");
        words.add("hated");
        words.add("clues");
        words.add("novel");
        words.add("shame");
        words.add("burnt");
        words.add("races");
        words.add("flash");
        words.add("weary");
        words.add("heels");
        words.add("token");
        words.add("coats");
        words.add("spare");
        words.add("shiny");
        words.add("alarm");
        words.add("dimes");
        words.add("sixth");
        words.add("clerk");
        words.add("mercy");
        words.add("sunny");
        words.add("guest");
        words.add("float");
        words.add("shone");
        words.add("pipes");
        words.add("worms");
        words.add("bills");
        words.add("sweat");
        words.add("suits");
        words.add("smart");
        words.add("upset");
        words.add("rains");
        words.add("sandy");
        words.add("rainy");
        words.add("parks");
        words.add("sadly");
        words.add("fancy");
        words.add("rider");
        words.add("unity");
        words.add("bunch");
        words.add("rolls");
        words.add("crash");
        words.add("craft");
        words.add("newly");
        words.add("gates");
        words.add("hatch");
        words.add("paths");
        words.add("funds");
        words.add("wider");
        words.add("grace");
        words.add("grave");
        words.add("tides");
        words.add("admit");
        words.add("shift");
        words.add("sails");
        words.add("pupil");
        words.add("tiger");
        words.add("angel");
        words.add("cruel");
        words.add("agent");
        words.add("drama");
        words.add("urged");
        words.add("patch");
        words.add("nests");
        words.add("vital");
        words.add("sword");
        words.add("blame");
        words.add("weeds");
        words.add("screw");
        words.add("vocal");
        words.add("bacon");
        words.add("chalk");
        words.add("cargo");
        words.add("crazy");
        words.add("acted");
        words.add("goats");
        words.add("arise");
        words.add("witch");
        words.add("loves");
        words.add("queer");
        words.add("dwell");
        words.add("backs");
        words.add("ropes");
        words.add("shots");
        words.add("merry");
        words.add("phone");
        words.add("cheek");
        words.add("peaks");
        words.add("ideal");
        words.add("beard");
        words.add("eagle");
        words.add("creek");
        words.add("cries");
        words.add("ashes");
        words.add("stall");
        words.add("yield");
        words.add("mayor");
        words.add("opens");
        words.add("input");
        words.add("fleet");
        words.add("tooth");
        words.add("cubic");
        words.add("wives");
        words.add("burns");

        this.size =this.words.size();

        Random rnd = new Random();
        int index = rnd.nextInt(this.size);
        this.chosenWord = (String)this.words.get(index).toString().toUpperCase();
    }
    public Boolean isWordReal(String word)
    {
     /*   String word2=word.toLowerCase();
        for(int i=0;i<this.words.size();i++)
        {
            if(word2==this.words.get(i))
                return true;
        }
                return false;*/
        return true;
    }
    public int GetSize()
    {
        return this.size;
    }
    public String GetChosenWord()
    {
        return this.chosenWord;
    }
}