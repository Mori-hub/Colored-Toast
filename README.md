
# Colored Toast

This view is a custom toast is included success, fail, warning , info and changeable toast arguments .

# Features
- Success toast
- Fail toast
- Warning toast
- Info's toast
- Changeable arguments toast

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
## Screenshots
<img src="https://user-images.githubusercontent.com/53067774/160169777-3021113f-06d0-47a4-b61e-030ee267834c.jpg" width="15%"></img> <img src="https://user-images.githubusercontent.com/53067774/160169787-7e5932e3-e655-47dc-9acd-d3b5e3bde725.jpg" width="15%"></img> <img src="https://user-images.githubusercontent.com/53067774/160169799-e814be6c-80ad-4f5e-8fab-785e81531964.jpg" width="15%"></img> <img src="https://user-images.githubusercontent.com/53067774/160169811-cb655179-8135-426a-b591-53917d9d1f4c.jpg" width="15%"></img> <img src="https://user-images.githubusercontent.com/53067774/160169821-1fb3b5b5-b598-4f53-b95c-9dd97a08f27e.jpg" width="15%"></img> <img src="https://user-images.githubusercontent.com/53067774/160169826-f005d538-e092-4a58-ab75-8ef5d32b08ae.jpg" width="15%"></img> 

## 🚀 About Me
I'm a full stack developer...


## 🛠 Skills
Java, Kotlin, CSS...

## Tech Stack

**Important:** For Gradle 7.2 & jitpack.io Please use this way : https://stackoverflow.com/a/71603699/12272687

**Update:** March 2022


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/Mori-hub)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/)
