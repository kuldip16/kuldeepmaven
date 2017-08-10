{% if test2 is not defined %}
    <div>
        NewsLetter Function called: {{ function }}
    </div>
{% endif %}

{% if test2 is defined %}
    <div>
        NewsLetter 2 Function called: {{ function }}
    </div>
{% endif %}
