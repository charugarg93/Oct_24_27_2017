<html>
    <body>
        <header>
            <h1>Welcome to the guessing game.</h1>
            <hr/>
        </header>
        <form method="POST" action="/differentgame/play">
            Enter your guess <input type="text" name="guess"><br/>
            <input type="submit" value="Play">
            <h2>${attempts}</h2>
            <h3>${message}</h3>
        </form>
    </body>
</html>