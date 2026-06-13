# 🎮 Endless Obstacle - Naruto 2D Platform Game

A fun 2D platformer game featuring characters from the anime **Naruto**! Navigate through endless obstacles, avoid dangerous enemies, and compete for the highest score.

---

## 🚀 Getting Started

### Prerequisites
- **Java 9+** (tested with Java 25)
- Linux/Mac/Windows OS

### Installation & Setup

1. **Navigate to the project directory:**
   ```bash
   cd ~/year4/Endless_obstacle/Documents/Year-3/Endless_Obstacle/platform2D
   ```

2. **Compile the project:**
   ```bash
   ~/Downloads/jdk-25.0.3+9/bin/javac -d bin $(find src -name "*.java")
   ```

3. **Run the game:**
   ```bash
   ~/Downloads/jdk-25.0.3+9/bin/java -cp bin:rsc platform2D.Main
   ```

**Quick Command (create an alias):**
```bash
alias play-naruto='cd ~/year4/Endless_obstacle/Documents/Year-3/Endless_Obstacle/platform2D && ~/Downloads/jdk-25.0.3+9/bin/java -cp bin:rsc platform2D.Main'
```

Then just type: `play-naruto`

---

## 🎮 How to Play

### Main Menu
- **Play** - Start the game
- **Options** - Choose your character
- **Quit** - Exit the game

### Character Selection (Options Screen)
Choose one of three characters:
- 🥷 **Naruto Uzumaki** - The main character
- ⚫ **Sasuke Uchiha** - The rival
- 🌸 **Sakura Haruno** - The kunoichi

Use the **left/right arrow buttons** to switch characters, then return to the menu to play.

### Gameplay Controls

| Key | Action |
|-----|--------|
| **UP Arrow** | Jump |
| **SPACE** | Jump |
| **DOWN Arrow** | Crouch/Lower action |
| **ESC** | Pause game |
| **P** | Pause/Resume |

### Game Mechanics

**Objective:** Survive as long as possible and rack up points!

**How to Score:**
- ✅ Avoid obstacles and enemies
- ✅ The longer you survive, the more points you earn
- ✅ Score increases automatically over time

**Enemies:**
- 🐍 **Snakes** - Appear on the ground, avoid by jumping
- 🐺 **Wolves** - Appear on the ground, avoid by jumping

**Obstacles:**
- Platform disappears
- Enemies chase you
- Increasing difficulty over time

**Health & Lives:**
- ⚠️ Contact with enemies = Game Over
- Get back to safety to keep playing

### Game Over
When you get hit by an enemy:
- Your score is saved
- Top score is tracked automatically
- Press a key to return to the menu and try again

---

## 📊 Scoring System

- **Score** - Current game score (increments every frame while playing)
- **Top Score** - Your highest score ever achieved (saved in `score.txt` and `topscore.txt`)

Scores are automatically saved when you die or exit the game.

---

## 🛑 Pause Menu

Press **ESC** or **P** during gameplay to:
- Pause the game
- View current statistics
- Resume playing
- Return to main menu

---

## 📁 Project Structure

```
platform2D/
├── src/
│   ├── platform2D/          # Game engine & main class
│   ├── Menu/                # Menu states (Menu, Options, Playing)
│   ├── entities/            # Player and enemy logic
│   ├── audio/               # Sound effects and music
│   ├── keyInput/            # Keyboard & mouse input handling
│   ├── UI/                  # UI components (buttons, overlays)
│   └── utilz/               # Utility functions & constants
├── rsc/                     # Game resources (images, sounds, sprites)
├── bin/                     # Compiled Java classes
└── README.md                # This file
```

---

## 🎵 Audio Features

- **Background Music** - Plays during menu and gameplay
- **Sound Effects** - Jump sounds, enemy sounds, hit effects
- **Character Voices** - Anime character voice lines

All audio is loaded from classpath resources.

---

## 🐛 Troubleshooting

### Game shows white screen
- Make sure resources are in the `rsc/` directory
- Compile with: `javac -d bin $(find src -name "*.java")`
- Run with: `java -cp bin:rsc platform2D.Main` (note the `:rsc`)

### No sound effects
- This is normal on some systems; the game still works fine
- Audio files must be in `rsc/newAudio/` directory

### Game runs slowly
- Close other applications
- Ensure you have Java 9+
- The game targets 60 FPS

---

## 🎯 Game Tips

1. **Master the jump timing** - Practice jumping over obstacles
2. **Watch for patterns** - Enemies appear in patterns, learn them
3. **Stay calm** - The difficulty increases gradually
4. **Aim for high scores** - Beat your top score each game!

---

## 🔧 Customization

### Change Game Resolution
Edit `src/platform2D/gamepanel.java`:
```java
public void setPanelsize() {
    Dimension size = new Dimension(1200, 400);  // Change these values
    setMinimumSize(size);
    setPreferredSize(size);
}
```

### Adjust Difficulty
Edit `src/entities/Player.java`:
```java
private float gravity = 0.9f;      // Jump physics
private float jumpSpeed = -20f;    // Jump height
private float groundLevel = 250;   // Ground position
```

### Change FPS/UPS
Edit `src/platform2D/game.java`:
```java
private final int FPS_SET = 60;    // Frames per second
private final int UPS_SET = 150;   // Updates per second
```

---

## 📝 Technical Details

- **Language:** Java
- **Graphics:** Java Swing (AWT)
- **Audio:** Java Sound API
- **Game Loop:** Fixed timestep with delta time
- **Rendering:** Double-buffering for smooth visuals
- **FPS:** Stable 60 FPS
- **UPS:** 150 updates per second

---

## 🏆 Features

✅ Multiple playable characters
✅ Dynamic obstacle system
✅ Score tracking (saved to file)
✅ Pause/Resume functionality
✅ Character selection menu
✅ Sound effects & background music
✅ Smooth 60 FPS gameplay
✅ Cross-platform (Windows, Mac, Linux)

---

## 📜 License & Credits

**Game by:** Year 3 Computer Science Project
**Based on:** Naruto anime series
**Built with:** Java Swing

---

## ❓ FAQ

**Q: Can I play with a controller?**
A: Currently only keyboard controls are supported.

**Q: Where are the high scores saved?**
A: In `rsc/topscore.txt` and `rsc/score.txt`

**Q: Can I modify the game?**
A: Yes! All source code is available. Edit and recompile.

**Q: Does it work on Linux?**
A: Yes! The game runs perfectly on Linux with Java 25.

---

## 🎉 Enjoy the Game!

Have fun playing **Endless Obstacle** and try to beat your high score! Good luck, ninja! 🥷

---

**Last Updated:** June 13, 2026
