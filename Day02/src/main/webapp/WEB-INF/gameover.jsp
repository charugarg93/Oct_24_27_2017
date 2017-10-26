<h1>Cool!!! </h1>
<h3>${message}</h3>
<h4>${attempts}</h4>
<hr/>
<h1>Provide your name, to store the results</h1>
<form action="/differentgame/storeresults" method="post">
    <input type="text" placeholder="Name" name="name">
    <input type="submit" value="Submit">
</form>
<h1>${error}</h1>