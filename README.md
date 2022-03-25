
# Colored Toast

A brief description of what this project does and who it's for


## Installation

Install my-project with https://jitpack.io/

```bash
  implementation 'com.github.Mori-hub:Colored-Toast:1.0.0'
```
    
## Usage/Examples

```kotlin
@Override

protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    
    setContentView(R.layout.activity_main);
    
    ColoredToast coloredToast= new ColoredToast(MainActivity.this);
    
            coloredToast.success("Welcome to Colored Toast", Toast.LENGTH_SHORT).show());
            coloredToast.fail("Welcome to Colored Toast", Toast.LENGTH_SHORT).show());
            coloredToast.warning("Welcome to Colored Toast", Toast.LENGTH_SHORT).show());
            coloredToast.info("Welcome to Colored Toast", Toast.LENGTH_SHORT).show());

    findViewById(R.id.button5).setOnClickListener(v->
            coloredToast.customs("Welcome to Colored Toast", Toast.LENGTH_SHORT,
            R.color.white, //Must be from Resource - Ignore 0
            android.R.drawable.editbox_dropdown_dark_frame,//Must be from Resource - Ignore 0
            Color.argb(205, 182, 104, 0),//Must be argb - Ignore 0
            android.R.drawable.btn_star_big_on,//Must be from Resource - Ignore 0
                    Gravity.BOTTOM // Ignore 0
            ).show());
}
```


## 🚀 About Me
I'm a full stack developer...


## 🛠 Skills
Java, Kotlin, CSS...

