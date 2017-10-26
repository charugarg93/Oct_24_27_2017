<html>
    <head>
        <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script>
            $("body").ready(function(){
                $("#historylink").on("click",talkToServer);
            });
            function talkToServer(){
                $.ajax({
                    url: "/differentgame/history",
                    type: "GET",
                    dataType: "json",
                    success: function(response){
                        for(var i=0;i<response.length;i++){
                            var game = response[i];
                            var tr = "<tr>";
                            tr += "<td>" + game.name + "</td>";
                            tr += "<td>" + game.target + "</td>";
                            tr += "<td>" + game.attempts + "</td>";
                            tr += "</tr>";
                            $("#results tbody").append(tr);
                        }
                    }
                });
            }
        </script>
    </head>
    <body>
        <h1>Thanks for playing the game. You can view the history here.</h1>
        <a id="historylink">Click here to view history</a>
        <table id="results">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Target</th>
                    <th>Attempts</th>
                </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </body>
</html>


