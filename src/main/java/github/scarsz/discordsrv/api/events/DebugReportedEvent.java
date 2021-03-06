/*
 * DiscordSRV - A Minecraft to Discord and back link plugin
 * Copyright (C) 2016-2017 Austin Shapiro AKA Scarsz
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package github.scarsz.discordsrv.api.events;

import lombok.Getter;

/**
 * <p>Called directly after a debug report was submitted to GitHub Gists and the requester was informed.</p>
 */
public class DebugReportedEvent extends Event {

    @Getter private final String message;
    @Getter private final String requester;
    @Getter private final String url;

    public DebugReportedEvent(String message, String requester, String url) {
        this.message = message;
        this.requester = requester;
        this.url = url;
    }

}
